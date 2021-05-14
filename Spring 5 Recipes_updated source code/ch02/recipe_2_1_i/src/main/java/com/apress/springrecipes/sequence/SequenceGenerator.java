package com.apress.springrecipes.sequence;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Setter
@NoArgsConstructor
public class SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        return builder.append(prefix)
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix)
                .toString();
    }
}