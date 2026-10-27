package com.google.common.escape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = null;
    private final char[][] replacementArray;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r2 = 0
            r0[r1] = r2
            r0[r2] = r2
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            char[][] r0 = (char[][]) r0
            com.google.common.escape.ArrayBasedEscaperMap.EMPTY_REPLACEMENT_ARRAY = r0
            return
    }

    private ArrayBasedEscaperMap(char[][] r1) {
            r0 = this;
            r0.<init>()
            r0.replacementArray = r1
            return
    }

    public static com.google.common.escape.ArrayBasedEscaperMap create(java.util.Map<java.lang.Character, java.lang.String> r1) {
            com.google.common.escape.ArrayBasedEscaperMap r0 = new com.google.common.escape.ArrayBasedEscaperMap
            char[][] r1 = createReplacementArray(r1)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static char[][] createReplacementArray(java.util.Map<java.lang.Character, java.lang.String> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lc
            char[][] r4 = com.google.common.escape.ArrayBasedEscaperMap.EMPTY_REPLACEMENT_ARRAY
            return r4
        Lc:
            java.util.Set r0 = r4.keySet()
            java.lang.Object r0 = java.util.Collections.max(r0)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            int r0 = r0 + 1
            char[][] r0 = new char[r0][]
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.lang.Character r2 = (java.lang.Character) r2
            char r3 = r2.charValue()
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            r0[r3] = r2
            goto L26
        L43:
            return r0
    }

    char[][] getReplacementArray() {
            r1 = this;
            char[][] r0 = r1.replacementArray
            return r0
    }
}
