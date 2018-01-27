import com.sdabyd2.programowanie.PTestImpl;
import org.junit.Assert;
import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;



import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;

public class PTest {
    @Test
    public void shouldFindLastElementFromList()
            throws Exception{
        Assert.assertThat(PTestImpl.lastElement(asList("a","b","c","d")),
                is(equalTo("d")));
    }
}
