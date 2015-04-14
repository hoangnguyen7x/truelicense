/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package org.truelicense.core.misc;

import javax.annotation.CheckForNull;
import java.util.Collections;
import java.util.List;

/**
 * An option is an immutable list of at most one non-null item.
 * Using the static constructor provided by this class allows you to avoid
 * programming with {@code null}able references.
 *
 * @author Christian Schlichtherle
 */
public final class Option {

    /**
     * Maps the given nullable item to an immutable list of at most one
     * non-null item.
     */
    public static <T> List<T> create(@CheckForNull T item) {
        return null != item
                ? Collections.singletonList(item)
                : Collections.<T>emptyList();
    }
}