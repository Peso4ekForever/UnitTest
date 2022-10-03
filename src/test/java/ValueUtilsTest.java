import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValueUtilsTest {
    private float value;
    private float factor;

    public ValueUtilsTest(){

    }

    @Before
    public void setValues(){
        this.value = 1.5F;
        this.factor = 2.0F;
    }

    @Test
    public void testSize(){
        float result = 3.0F;
        //Assert.assertEquals(result, ValueUtils.size(this.value, this.factor));
        Assert.assertEquals(3.0F, ValueUtils.size(this.value, this.factor), 0.0F); //Дельта - макс. разница в плавающих вычислениях
    }

}
