/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package microsoft.azure.sample.model;

import com.microsoft.azure.sample.model.TodoItem;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TodoItemTest {

    final TodoItem item = new TodoItem("test", "description", "owner");

    @Test
    public void testFinished() {
        assertThat(item.isFinished(), is(not(true)));
        item.setFinish(true);
        assertThat(item.isFinished(), is(true));
    }

    @Test
    public void testDescripiton() {
        assertThat(item.getDescription(), is(equalTo("description")));
        item.setDescription("changed-description");
        assertTrue(item.getDescription().contains("changed"));
    }
}
