package io.github.zlishaojiez.module.a;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ModuleATest {

    @Test
    void test() {
        final ModuleA moduleA = ModuleA.builder()
                .name("Module A")
                .build();
        assertThat(moduleA.getName()).isEqualTo("Module A");
    }
}