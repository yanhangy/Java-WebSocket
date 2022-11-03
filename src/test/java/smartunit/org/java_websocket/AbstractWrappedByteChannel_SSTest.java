/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.org.java_websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import org.java_websocket.WrappedByteChannel;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractWrappedByteChannel_SSTest extends AbstractWrappedByteChannel_SSTest_scaffolding {
// allCoveredLines:[45, 46, 47, 53, 54, 55, 69, 70, 74, 84, 88, 98, 103, 105, 108]

  @Test(timeout = 4000)
  public void test_close_0()  throws Throwable  {
      //caseID:7c55d633a5775127a25adfaa2c3f1e8f
      //CoveredLines: [45, 46, 47, 69, 70]
      
      //mock byteChannel0
      ByteChannel byteChannel0 = mock(ByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AbstractWrappedByteChannel abstractWrappedByteChannel0 = new AbstractWrappedByteChannel(byteChannel0);
      
      //Call method: close
      abstractWrappedByteChannel0.close();
  }

  @Test(timeout = 4000)
  public void test_isBlocking_1()  throws Throwable  {
      //caseID:ae4d56b51daecf55aa8b9924e6865064
      //CoveredLines: [45, 46, 47, 103, 105, 108]
      //Assert: assertFalse(method_result);
      
      //mock byteChannel0
      ByteChannel byteChannel0 = mock(ByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AbstractWrappedByteChannel abstractWrappedByteChannel0 = new AbstractWrappedByteChannel(byteChannel0);
      
      //Call method: isBlocking
      boolean boolean0 = abstractWrappedByteChannel0.isBlocking();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_readMore_2()  throws Throwable  {
      //caseID:816af2b0aa34ddc6673e66499e3e9a53
      //CoveredLines: [45, 46, 47, 98]
      //Input_0_ByteBuffer: {}
      //Assert: assertEquals(0, method_result);
      
      //mock byteChannel0
      ByteChannel byteChannel0 = mock(ByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AbstractWrappedByteChannel abstractWrappedByteChannel0 = new AbstractWrappedByteChannel(byteChannel0);
      //mock byteBuffer0
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: readMore
      int int0 = abstractWrappedByteChannel0.readMore(byteBuffer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_write_3()  throws Throwable  {
      //caseID:5c3998367d3b241d0b26b1dc90ef42b6
      //CoveredLines: [45, 46, 47, 74]
      //Input_0_ByteBuffer: {}
      //Assert: assertEquals(0, method_result);
      
      //mock byteChannel0
      ByteChannel byteChannel0 = mock(ByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AbstractWrappedByteChannel abstractWrappedByteChannel0 = new AbstractWrappedByteChannel(byteChannel0);
      //mock byteBuffer0
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: write
      int int0 = abstractWrappedByteChannel0.write(byteBuffer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_writeMore_4()  throws Throwable  {
      //caseID:11f7ed441d4c23e502500dde497da8f0
      //CoveredLines: [53, 54, 55, 84, 88]
      
      //mock wrappedByteChannel0
      WrappedByteChannel wrappedByteChannel0 = mock(WrappedByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AbstractWrappedByteChannel abstractWrappedByteChannel0 = new AbstractWrappedByteChannel(wrappedByteChannel0);
      //mock byteChannel0
      ByteChannel byteChannel0 = mock(ByteChannel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) AbstractWrappedByteChannel.class, abstractWrappedByteChannel0, "channel", (Object) byteChannel0);
      
      //Call method: writeMore
      abstractWrappedByteChannel0.writeMore();
  }
}
