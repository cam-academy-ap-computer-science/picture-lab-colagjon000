package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()	{
	  Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images//caterpillar.jpg");
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  //negate
  public static void testNegate()
  {
    Picture caterpillar = new Picture("images//caterpillar.jpg");
    caterpillar.negate();
    caterpillar.explore();
  }
  
  //horizontal
  public static void testMirrorHorizontal()
  {
    Picture motor = new Picture("images//redMotorcycle.jpg");
    motor.mirrorVertical();
    motor.explore();
  }
  
  //right to left
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("images//caterpillar.jpg");
    caterpillar.mirrorVerticalRightToleft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images//temple.jpg");
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("images//snowman.jpg");
    temple.mirrorTemple();
    temple.explore();
  }
  //mirrors a seagull
  public static void testMirrorGull() {
	  Picture gull = new Picture("images//seagull.jpg");
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images//640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images//swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  //testGrayScale
  public static void testGrayscale()
  {
    Picture swan = new Picture("images//swan.jpg");
    swan.grayscale();
    swan.explore();
  }
  
  //fixUnderWater
  public static void testFixUnderwater()
  {
    Picture water = new Picture("images//water.jpg");
    water.fixUnderWater();
    water.explore();
  }
  
  //copy
  public static void testCopy()	 {
	  Picture canvas = new Picture("images//640x480.jpg");
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
