package com.apress.springrecipes.sequence;

import com.apress.springrecipes.sequence.config.SequenceGeneratorConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);

        SequenceGenerator generator = context.getBean(SequenceGenerator.class);

        log.info(generator.getSequence());
        log.info(generator.getSequence());
    }
}