package io.github.zlishaojiez.module.b;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ModuleBTest {

    @Test
    void test() {
        final ModuleB moduleB = ModuleB.builder()
                .name("Module B")
                .build();
        assertThat(moduleB.getName()).isEqualTo("Module B");
    }
}