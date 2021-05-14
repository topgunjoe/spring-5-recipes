package com.apress.springrecipes.sequence;

import lombok.Value;

@Value
public class Sequence {
    String id;
    String prefix;
    String suffix;
}
