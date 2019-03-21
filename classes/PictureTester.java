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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("Golden_Spikes.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void KeepOnlyBlue()
  {
    Picture spike = new Picture("Golden_Spikes.jpg");
    Pixel[][] pixels = spike.getPixels2D();
    for(Pixel[] rowArray: pixels)
    {
      for(Pixel pixelObj: rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
    spike.explore();
  }
  public static void Negate()
  {
   Picture spike = new Picture("Golden_Spikes.jpg");
   Pixel[][] pixels = spike.getPixels2D();
    for(Pixel[] rowArray: pixels)
    {
      for(Pixel pixelObj: rowArray)
      {
        pixelObj.setBlue(255-pixelObj.getBlue());
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setRed(255-pixelObj.getRed());
      }
    }
    spike.explore();
  }
  public static void Grayscale()
  {
    Picture spike = new Picture("Golden_Spikes.jpg");
    Pixel[][] pixels = spike.getPixels2D();
    for(Pixel[] rowArray: pixels)
    {
      for(Pixel pixelObj: rowArray)
      {
        pixelObj.setBlue((pixelObj.getGreen()+pixelObj.getBlue()+pixelObj.getRed())/3);
        pixelObj.setGreen((pixelObj.getGreen()+pixelObj.getBlue()+pixelObj.getRed())/3);
        pixelObj.setRed((pixelObj.getGreen()+pixelObj.getBlue()+pixelObj.getRed())/3);
      }
    }
    spike.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //KeepOnlyBlue();
    //KeepOnlyRed();
    //KeepOnlyGreen();
    //Negate();
    //Grayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}