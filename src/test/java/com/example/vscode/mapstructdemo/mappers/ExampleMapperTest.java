package com.example.vscode.mapstructdemo.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.vscode.mapstructdemo.domain.Source;
import com.example.vscode.mapstructdemo.domain.Target;

import org.junit.jupiter.api.Test;

public class ExampleMapperTest {

    @Test
    public void shouldMapSourceToTarget() {
        // given
        Source dto = new Source("Philip", "Morris");

        // when
        Target domain = ExampleMapper.INSTANCE.dtoToDomain(dto);

        // then
        assertEquals("Philip", domain.getName());
        assertEquals("Morris", domain.getSurname());
    }
}
