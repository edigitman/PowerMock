/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.agitman.test;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ro.agitman.mockito.Truble;
import ro.agitman.mockito.Wrapper;

/**
 *
 * @author edi
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Truble.class)
public class TestTrouble {

    @Test
    public void executeTest() throws Exception {
               
        Wrapper mockObject = PowerMock.createMock(Wrapper.class);        
        PowerMock.expectNew(Wrapper.class).andReturn(mockObject);
        mockObject.doJdbc();
        PowerMock.expectLastCall().times(1);
        
        PowerMock.replayAll();
        
        Truble t = new Truble();
        t.execute();
    }

}
