package a8;

public class Model implements Runnable{
    private boolean[][] area;
    private boolean square;
    private int rowsNumber, colsNumber;
    private int var;
    private int iteration;


    public Model(int rowsNumber, int colsNumber, boolean square) {
        this.rowsNumber = rowsNumber;
        this.colsNumber = colsNumber;
        this.square = square;
        this.area = new boolean[rowsNumber][colsNumber];
        this.iteration = 0;
    }

    public void MyRunnable(int var) {
        this.var = var;
    }
    
    
	@Override
	public void run() {
    	
        int cell = 0, row, col;
        boolean[][] areaCopy = this.copyArea();

        for (row = 0; row < rowsNumber; row++) {
            for (col = 0; col < colsNumber; col++) {
                if (square) {
                    if (row == 0 && col == 0) {
                        if (areaCopy[rowsNumber - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == colsNumber - 1) {
                        if (areaCopy[rowsNumber - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == 0) {
                        if (areaCopy[row - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][0]) {
                            cell++;
                        }
                    } else if (row == 0 && col != colsNumber - 1) {
                        if (areaCopy[rowsNumber - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col != colsNumber - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                } else {
                    if (row == 0 && col == 0) {
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == colsNumber - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col != colsNumber - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col != colsNumber - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                }
                if (areaCopy[row][col]) {
                    if (cell == 0 || cell == 1 || cell >= 4) {
                        area[row][col] = false;
                    }
                } else {
                    if (cell == 3) {
                        area[row][col] = true;
                    }
                }
                cell = 0;
            }
        }
    }	

	public void setName (String test) {
		test=test;
	}
	
	public void setIterationNumber () {
		iteration++;
	}
	
	public String getIterationNumber () {
		String iter = String.valueOf(iteration);
		return iter;
	}

    public void nextGen() {
		iteration++;

    	
        int cell = 0, row, col;
        boolean[][] areaCopy = this.copyArea();

        for (row = 0; row < rowsNumber; row++) {
            for (col = 0; col < colsNumber; col++) {
                if (square) {
                    if (row == 0 && col == 0) {
                        if (areaCopy[rowsNumber - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == colsNumber - 1) {
                        if (areaCopy[rowsNumber - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == 0) {
                        if (areaCopy[row - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][0]) {
                            cell++;
                        }
                    } else if (row == 0 && col != colsNumber - 1) {
                        if (areaCopy[rowsNumber - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rowsNumber - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col != colsNumber - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][colsNumber - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                } else {
                    if (row == 0 && col == 0) {
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == colsNumber - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col != colsNumber - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rowsNumber - 1 && col != colsNumber - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rowsNumber - 1 && row != 0 && col == colsNumber - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                }
                if (areaCopy[row][col]) {
                    if (cell == 0 || cell == 1 || cell >= 4) {
                        area[row][col] = false;
                    }
                } else {
                    if (cell == 3) {
                        area[row][col] = true;
                    }
                }
                cell = 0;
            }
        }
    }

    // Calculates stationary generation
    public int getStationary() {
        Model v = (Model)this.clone();
        int stationary = 0;

        for (int i = 0; i < 1000; i++) {
            boolean[][] areaCopy2 = v.copyArea();

            v.nextGen();

            // Check if the current matrix and the last are equal
            boolean equal = true;
            for (int row2 = 0; row2 < rowsNumber; row2++) {
                for (int col2 = 0; col2 < colsNumber; col2++) {
                    if (areaCopy2[row2][col2] != v.area[row2][col2]) {
                        equal = false;
                        break;
                    }
                }
            }

            if (!equal) {
                stationary++;
            }
        }

        if(stationary < 1000) {
            return stationary;
        } else {
            return -1;
        }
    }

    public boolean[][] getArea() {
        return area;
    }

    public void setArea(boolean[][] area) {
        this.area = area;
    }

    public void clearArea() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                area[i][j] = false;
            }
        }
    }

    private boolean[][] copyArea() {
        boolean[][] areaCopy = new boolean[rowsNumber][colsNumber];

        for (int row = 0; row < rowsNumber; row++) {
            if (colsNumber >= 0) System.arraycopy(area[row], 0, areaCopy[row], 0, colsNumber);
        }
        return areaCopy;
    }

    protected Model clone() {
        Model v = new Model(rowsNumber, colsNumber, square);
        v.area = this.copyArea();
        return v;
    }
}