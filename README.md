# ACM Research Coding Challenge (Spring 2021) - Jayita Malik

## My Approach To The Problem

I have used Java 11 SE.
My approach towards problem solving is:

  1. Reading the `Genome.gb` file using input buffer and handling using IOException
  2. Storing important content into an array. 
  3. Assign genomic/sequence features to specefic bases of DNA sequence
  4. Converting the circular genome map to an image file
  
Converting Circular Genome Map to an Image file: 

  1. Using the Java Image I/O API (javax.imageio) or java.io
  2. Use image buffer to store the image and check IOException
  3. Takes Circular Genome Map object as input 
  4. Outputs the JPG/PNG file 

Reading `Genome.gb` file:

  1. Reading input stream with buffered reader
  2. Use .regex to identify sequences in the `.gb` file using splits
  3. Assign information to their proper labels



## References

  1. https://github.com/paulstothard/cgview/blob/master/src/main/java/ca/ualberta/stothard/cgview/CgviewIO.java 
     For ImageIO
  
  2. https://paulstothard.github.io/cgview/apidocs/ca/ualberta/stothard/cgview/Cgview.html
     For overall concept
  
  3. https://docs.oracle.com/javase/8/docs/api/javax/imageio/package-summary.html
     For ImageIO
  
  4. https://github.com/paulstothard/cgview/blob/master/src/main/java/ca/ualberta/stothard/cgview/CgviewFactoryTab.java
     For reading and understanding `Genome.gb`
