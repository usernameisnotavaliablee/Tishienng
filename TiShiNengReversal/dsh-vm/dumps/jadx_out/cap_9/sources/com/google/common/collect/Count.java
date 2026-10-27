package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Count implements java.io.Serializable {
    private int value;

    Count(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public void add(int r2) {
            r1 = this;
            int r0 = r1.value
            int r0 = r0 + r2
            r1.value = r0
            return
    }

    public int addAndGet(int r2) {
            r1 = this;
            int r0 = r1.value
            int r0 = r0 + r2
            r1.value = r0
            return r0
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.Count
            if (r0 == 0) goto Le
            com.google.common.collect.Count r2 = (com.google.common.collect.Count) r2
            int r2 = r2.value
            int r0 = r1.value
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int get() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public int getAndSet(int r2) {
            r1 = this;
            int r0 = r1.value
            r1.value = r2
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public void set(int r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.value
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }
}
