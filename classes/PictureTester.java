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
  public static void MirrorTemple()
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
  public static void FixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    Pixel[][] pixels = water.getPixels2D();
    for(Pixel[] rowArray: pixels)
    {
      for(Pixel pixelObj: rowArray)
      {
        pixelObj.setBlue(pixelObj.getBlue()-50);
        pixelObj.setGreen(pixelObj.getGreen()-50);
        pixelObj.setRed(pixelObj.getRed()+50);
      }
    }
    water.explore();
  }
  public static void MirrorVertical()
  {
    Picture spike = new Picture("Golden_Spikes.jpg");
    Pixel[][] pixels = spike.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for(int row =0; row< pixels.length;row++)
    {
      for(int col=0; col<width/2;col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width-1-col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
    spike.explore();
  }
  public static void MirrorHorizontal()
  {
    Picture spike = new Picture("Golden_Spikes.jpg");
    Pixel[][] pixels = spike.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for(int row=0; row < height/2;row++)
    {
      for(int col = 0; col<pixels[0].length;col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    spike.explore();
  }
  public static void MirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    Pixel[][] pixels = snowman.getPixels2D();
    int leftArmPoint = 191;
    int rightArmPoint = 196;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    for(int row = 159;row<leftArmPoint;row++)
    {
      for (int col = 105; col < 170; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[leftArmPoint - row +leftArmPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    for(int row = 171; row<rightArmPoint;row++)
    {
      for(int col = 238; col< 294;col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[rightArmPoint-row+rightArmPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    snowman.explore();
  }
  public static void MirrorGull()
  {
    Picture seagulls = new Picture("seagull.jpg");
    Pixel[][] pixels = seagulls.getPixels2D();
    int shift = 344-238;
    Pixel copy = null;
    Pixel paste = null;
    for(int row = 235;row<322;row++)
    {
      for(int col = 238;col<344;col++)
      {
        copy = pixels[row][col];
        paste =pixels[row][col+shift];
        paste.setColor(copy.getColor());
      }
    }
    seagulls.explore();
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
    //FixUnderwater();
    //MirrorVertical();
    //MirrorHorizontal();
    //MirrorTemple();
    //MirrorArms();
    MirrorGull();
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