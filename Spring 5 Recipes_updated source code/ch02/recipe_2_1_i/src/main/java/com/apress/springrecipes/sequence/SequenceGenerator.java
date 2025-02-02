package com.apress.springrecipes.sequence;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Setter
@NoArgsConstructor
public class SequenceGenerator {

    private final AtomicInteger counter = new AtomicInteger();
    private String prefix;
    private String suffix;
    private int initial;

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        return builder.append(prefix)
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix)
                .toString();
    }
}