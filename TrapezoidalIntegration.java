/*	Trapezoidal Rule (Numerical Integration Approximation)
		The theory is to make evenly spaced trapezoids beneath the curve of the plot.
		Because the area of a trapezoid is easily found, the area beneath the curve
		can be easily approximated by:

		I = T_1 + T_2 + ... + T_n.
		
		where the area of each trapezoid is given by:
		
		T_n = 1/2 * h * [f(x) + f(x+1)]
		
		Supposing the width of each trapezoid to be
		small enough, the approximation can be quite close.
*/

class TrapezoidalIntegration {
	
	int numOfTrapezoids;
	double[] inputArray;
	boolean printTagFlag = false;	// set true for verbosity
	
	/*	This constructor will take:
			inputArray;			An array of data (making a plot, were it plotted and such.
			numOfTrapezoids;	The number of trapezoids.
	*/
	TrapezoidalIntegration(int numOfTrapezoids) {
		this.numOfTrapezoids = numOfTrapezoids;
	}
	
	double equation(double x) {
		//	Let's use test equation y = x^2 + 10. You can use anything though I suppose...
		double y = Math.pow(x,2) + 10;
		
		return y;
	}

	
	void integrate(double functionMin, double functionMax) {
		
		final double dx = (functionMax - functionMin) / (numOfTrapezoids - 1);
		double currentSum = 0;
		double areaOfTrapezoid;

		for(int iIndex = 1; iIndex < numOfTrapezoids; iIndex++) {
			
			double xi = functionMin + (((double) iIndex - 1.0) * dx);
			double xii = functionMin + (((double) iIndex) * dx);
			
			areaOfTrapezoid = 0.5 * dx * (equation(xii) + equation(xi));
			
			currentSum = currentSum + areaOfTrapezoid;
		}
		
		System.out.println("currentSum [FINAL]: " + currentSum);				
		
	}
}
			
