package _06_Snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

// Go through the methods and complete the steps in this class
// and the Snake class

public class _00_SnakeGame implements ActionListener, KeyListener {
	public static final Color BORDER_COLOR = Color.WHITE;
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final Color FOOD_COLOR = Color.RED;
	public static final int WIDTH = 15;
	public static final int HEIGHT = 12;
	public static final int WINDOW_SCALE = 50;
	public static final int WINDOW_WIDTH = WINDOW_SCALE * WIDTH;
	public static final int WINDOW_HEIGHT = WINDOW_SCALE * HEIGHT;
	static Direction d;
	private JFrame window;
	private JPanel panel;

	private static Snake snake;

	private Timer timer;

	private static Location foodLocation;

	public _00_SnakeGame() {
		snake = new Snake(new Location(WIDTH / 2, HEIGHT / 2));

		window = new JFrame("Snake");
		panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;

				g2.setColor(BACKGROUND_COLOR);
				g2.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

				g2.setColor(FOOD_COLOR);
				g2.drawOval(foodLocation.x * WINDOW_SCALE, foodLocation.y * WINDOW_SCALE, Snake.BODY_SIZE,
						Snake.BODY_SIZE);
		
				snake.draw(g);
				
				
				
			}
		};

		panel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		window.add(panel);

		timer = new Timer(0, this);

		window.pack();
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		setFoodLocation();

		startGame();
	}

	public void startGame() {
		//1. Save the instructions for the game in the following string variable.
		String instructions = "eat as miny ticks as possible Also you must get eat two fruits to get the first segment ";
		
		String[] options = new String[] { "Expert", "Moderate", "Beginner" };
		int input = JOptionPane.showOptionDialog(null, instructions, "Snake", 0, -1, null, options, 0);

		String choice = options[input];
		
		//2. Use a switch statement to determine which difficulty was chosen.
		//   Use timer.setDelay(delay) with different numbers to change the speed
		//   of the game. The smaller the number, the faster it goes.
 switch(input) {
 case 0: 
		timer.setDelay(100);
		break;
	case 1: 
		timer.setDelay(500);
		break;
	default: 
		timer.setDelay(1000);
		break;
	}
 
 
		
		
		//3. start the timer

 timer.start();
	}

	public static void main(String[] args) {
		new _00_SnakeGame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		//1. Use a switch statement on e.getKeyCode()
		//   to determine which key was pressed.
		 d = null;
		
		switch(e.getKeyCode()) {
		
		// if an arrow key is pressed, set the snake's 
		// direction accordingly
		
		case KeyEvent.VK_UP: 
			d = Direction.UP;
			snake.setDirection(d);
			break;
		case KeyEvent.VK_LEFT: 
			d = Direction.LEFT;
			snake.setDirection(d);
			break;
		case KeyEvent.VK_RIGHT: 
			d = Direction.RIGHT;
			snake.setDirection(d);
			break;
			
		case KeyEvent.VK_DOWN: 
			d = Direction.DOWN;
			snake.setDirection(d);
			break;
		case KeyEvent.VK_SPACE: 
		snake.feed();
			break;
		default: 
			
			d = Direction.STOP;
		}
		// if the space key is pressed, call the snake's feed method
		
		
		
	}

	static void setFoodLocation() {
		//1. Create a new Location object that is set to a random location
		Random r = new Random();
		int y = r.nextInt(HEIGHT);
		int x = r.nextInt(WIDTH);
		
		Location l = new Location(x,y);
		
		//2. set the foodLocation variable equal to the Location object you just created.
		//   use the snake's isLocationOnSnake method to make sure you don't put the food on the snake
		foodLocation = l;
		snake.isLocationOnSnake(foodLocation);
	}

	private void gameOver() {
		
		//1. stop the timer
		timer.stop();
		
		//2. tell the user their snake is dead
		String[] options = new String[] { "Play Again", "Exit"};
		int input = JOptionPane.showOptionDialog(null, "Your Snake is Dead, Would like to play again ", "Snake", 0, -1, null, options, 0);
		//3. ask them if they want to play again.
		
		//4. if they want to play again
		if(input == 0) {
			snake.reset(new Location(WIDTH / 2, HEIGHT / 2));
			d = Direction.STOP;
	 startGame();
		}
		else {
			window.setVisible(false);
		}
		
		//   reset the snake and the food and start the timer
		//   else, exit the game
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//1. update the snake
		
snake.update();
		
		//2. if the snake is colliding with its own body 
		//   or if the snake is out of bounds, call gameOver

if(snake.isHeadCollidingWithBody()) {
	gameOver();
}

if(snake.isOutOfBounds()) {
	
	gameOver();
}

		//3. if the location of the head is equal to the location of the food,
		// 	 feed the snake and set the food location
int x =snake.getHeadLocation().x;
int y = snake.getHeadLocation().y;
if(x==foodLocation.x&&y==foodLocation.y) {

	snake.feed();
}

		//4. call panel.repaint();
panel.repaint();

	}
}
