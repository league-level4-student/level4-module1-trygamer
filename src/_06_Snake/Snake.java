package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import org.junit.jupiter.params.converter.DefaultArgumentConverter;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;
	int lengthS = 0;
	private Direction currentDirection;

	//_00_SnakeGame sg = new _00_SnakeGame();
	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);
		
			
		
		
		
		currentDirection =Direction.STOP;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		System.out.println(snake.get(0).getLocation());
		
		//(currentDirection==Direction.RIGHT  ) {
		//snake.add(new SnakeSegment(new Location(head.getLocation().x-lengthS ,head.getLocation().y), BODY_SIZE));
		snake.add(new SnakeSegment(new Location(5 ,5), BODY_SIZE));
//
		 lengthS++;
		_00_SnakeGame.setFoodLocation();
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

 
	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		
		Location l =head.getLocation();
	
		switch(currentDirection) {
		
		case UP:
			l.y--;
			
		  break;
		case DOWN:
			l.y++;
			
			  break;
		case LEFT:
			l.x--;
			  break;
		case RIGHT:
		
		l.x++;
			  break;
		case STOP:
				  l.x--;
				  l.x++;
				  break;
		
		
		}
		
		if( _00_SnakeGame.d != null) {
			
		
				currentDirection = _00_SnakeGame.d;
		}
		
	
		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		
		for(int i= snake.size()-1; i>0; i--) {
			
			snake.get(i).setLocation(snake.get(i-1).getLocation());
			
		}
		
		
		//3. set the location of the head to the new location calculated in step 1
		
//head.setLocation(

		//4. set canMove to true
		canMove = true;
		
	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.

		if (canMove) {
			if (currentDirection == Direction.UP && d != Direction.DOWN) {
				currentDirection = d;

			} else if (currentDirection == Direction.LEFT && d != Direction.RIGHT) {
				currentDirection = d;

			} else if (currentDirection == Direction.RIGHT && d != Direction.LEFT) {
				currentDirection = d;

			} else if (currentDirection == Direction.DOWN && d != Direction.UP) {
				currentDirection = d;

			}

			canMove = false;
		}

	}

	public void reset(Location loc) {
		// 1. clear the snake
		snake.clear();
		// 2. set the location of the head
		head.setLocation(loc);

		// 3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outside
		// of the window
		// and false otherwise
		int x = head.getLocation().x;
		int y = head.getLocation().y;
		if (x <= -2 || x >= 16|| y <=-2 || y >= 13) {
			
			return true;
		}

		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment
		System.out.println(snake.size());
		for (int i = 2; i < snake.size(); i++) {
			System.out.println(snake.size());
			System.out.println("HCWB");
			if (head.getLocation().x == snake.get(i).getLocation().x && head.getLocation().y == snake.get(i).getLocation().y) {
				System.out.println("Collision");
				return true;
				
			}

		}

		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake

		for (int i = 0; i < snake.size(); i++) {
			if (snake.get(i).getLocation().x == loc.x && snake.get(i).getLocation().y == loc.y) {
				return true;

			}

		}

		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
