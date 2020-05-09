package Calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrameForWorkerTest {

	@Test
    public void calculationsPaper() {
        assertEquals(3.0,new FrameForWorker().calculationsPaper("2000","1000"),0.001);
    }

    @Test
    public void calculationsLoad0() {
        assertEquals(100.0,new FrameForWorker().calculationsLoad0("2000","1000","Xerox Phaser 3020BI"),0.001);
    }

    @Test
    public void calculationsLoad() {
        assertEquals(0.0,new FrameForWorker().calculationsLoad("2000","1000","Xerox Phaser 3020BI"),0.001);
    }
}