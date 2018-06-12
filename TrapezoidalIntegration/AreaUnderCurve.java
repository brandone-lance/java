public class AreaUnderCurve {
	public static void main(String[] args) {
		double[] inputArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		//	Argument is number of rectangles
		TrapezoidalIntegration areaUnderCurve = new TrapezoidalIntegration(500);
		
		//	Arguments are bounds of integration
		areaUnderCurve.integrate(-1,2);
	}
	
}
