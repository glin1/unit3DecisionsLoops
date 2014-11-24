import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 7;
    private final int COLS = 7;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 2, Y1 = 3;
    private final int X2 = 3, Y2 = 2;
    private final int X3 = 3, Y3 = 3;
    private final int X4 = 3, Y4 = 4;
    private final int X5 = 4, Y5 = 2;
    private final int X6 = 4, Y6 = 4;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Flower flower1 = new Flower();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, flower1);
        
        Flower flower2 = new Flower();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, flower2);
        
        Flower flower3 = new Flower();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, flower3);
        
        Flower flower4 = new Flower();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, flower4);
        
        Flower flower5 = new Flower();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, flower5);
        
        Flower flower6 = new Flower();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, flower6);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        //create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid2);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
        int count =0;
        int a=0;
        int b=0;
        while (b<3)
        {
            b++;
            for (int x=1; x<5; x++)
            {
                for (int y=1; y<5; y++)
                {
                    if ((x-1,y-1) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((x-1,y) = null)
                    {
                        count++;
                        a++;
                    }
                    
                    if ((x-1,y+1) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((x,y-1) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((x,y+1) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((x+1,y-1) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((x+1,y) = null)
                    {
                        count++;
                        a++;
                    }
                    if ((X+1,y+1) = null)
                    {
                        count++;
                        a++;
                    }
                    
                    while (a>0)
                    {
                        if (count=5)
                        {
                            Location loc2=new Location (x,y);
                            Flower flower2= new Flower();
                            grid2.put (loc2,flower2);
                            count=0;
                            a=0;
                        }
                        else if ((count=5 || count=6) && (x,y) != null)
                        {
                            Location loc2=new Location (x,y);
                            Flower flower2= new Flower();
                            grid2.put (loc2,flower2);
                            count=0;
                            a=0;
                        }
                        }
                    }
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
                }
            }
            }
        }
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
