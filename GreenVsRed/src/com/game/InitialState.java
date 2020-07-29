package com.game;

import java.util.Scanner;

import static com.game.config.Constants.MAX_GRID_SIZE;

//class that initialize game
//with width/height for the grid
// 2. The elements themselves
// 3. x and y coordinates
// 4. Rounds


// Max width and height for the grid
public class InitialState {
    private int width; 
    private int height; 


    private String[][] grid; // Two dimensional array

    private int setX; // looks for coordinates x
    private int setY; // looks for coordinates y
    private int maxRounds; 

    public InitialState() {
        this.width = 0;
        this.height = 0;
    }

    public void init() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a width ");
        this.width = scanner.nextInt();

        System.out.print("Enter a height ");
        this.height = scanner.nextInt();

        if (this.width != 0 && this.width <= this.height && this.height < MAX_GRID_SIZE)
            System.out.println("The game begins");
        else
            System.out.println("The game starting is failed, try again");

        grid = new String[this.width][this.height];
        initTwoDimArray(grid);

        System.out.println("Enter coordinates for x");
        setX = scanner.nextInt();
        System.out.println("Enter coordinates for y");
        setY = scanner.nextInt();
        System.out.println("Enter max rounds (N)");
        maxRounds = scanner.nextInt();
    }

    private static void initTwoDimArray(String[][] array){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Row " + (i + 1) + "(green(1s)/red(0s))");
            for (int j = 0; j < array.length; j++) {
                String line = in.nextLine();
                if (line.equals("1s") || line.equals("0s"))
                    array[i][j] = line;
                else array[i][j] = "0s";
            }
        }
    }

    public void showInputs() {
        System.out.println(this.width + ", " + this.height);

        for(short i = 0; i < grid.length; i++) {
            for(short j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " \t");
            }
            System.out.println("\n");
        }

        System.out.println(this.setX + ", " + this.setY + ", " + this.maxRounds);
    }

    public String[][] getGrid() {
        return grid;
    }

    public int getOffsetX() {
        return setX;
    }

    public int getOffsetY() {
        return setY;
    }

    public int getMaxRounds() {
        return maxRounds;
    }
}
