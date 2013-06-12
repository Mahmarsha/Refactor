package com.length;

import com.library.Meter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: marsha
 * Date: 6/12/13
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthTest {

    @Test
    public void return_string_with_unit(){
        Meter meter = new Meter(6);

        assertThat(meter.toString(),is("6m"));
    }






}
