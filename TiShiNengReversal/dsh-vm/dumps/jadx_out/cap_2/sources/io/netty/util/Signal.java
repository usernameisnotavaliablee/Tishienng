package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Signal extends java.lang.Error implements io.netty.util.Constant<io.netty.util.Signal> {
    private static final io.netty.util.ConstantPool<io.netty.util.Signal> pool = null;
    private static final long serialVersionUID = -221145131122459977L;
    private final io.netty.util.Signal.SignalConstant constant;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SignalConstant extends io.netty.util.AbstractConstant<io.netty.util.Signal.SignalConstant> {
        SignalConstant(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            io.netty.util.Signal$1 r0 = new io.netty.util.Signal$1
            r0.<init>()
            io.netty.util.Signal.pool = r0
            return
    }

    private Signal(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            io.netty.util.Signal$SignalConstant r0 = new io.netty.util.Signal$SignalConstant
            r0.<init>(r2, r3)
            r1.constant = r0
            return
    }

    /* synthetic */ Signal(int r1, java.lang.String r2, io.netty.util.Signal.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.util.Signal valueOf(java.lang.Class<?> r1, java.lang.String r2) {
            io.netty.util.ConstantPool<io.netty.util.Signal> r0 = io.netty.util.Signal.pool
            io.netty.util.Constant r1 = r0.valueOf(r1, r2)
            io.netty.util.Signal r1 = (io.netty.util.Signal) r1
            return r1
    }

    public static io.netty.util.Signal valueOf(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.util.Signal> r0 = io.netty.util.Signal.pool
            io.netty.util.Constant r1 = r0.valueOf(r1)
            io.netty.util.Signal r1 = (io.netty.util.Signal) r1
            return r1
    }

    public int compareTo(io.netty.util.Signal r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 0
            return r2
        L4:
            io.netty.util.Signal$SignalConstant r0 = r1.constant
            io.netty.util.Signal$SignalConstant r2 = r2.constant
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            io.netty.util.Signal r1 = (io.netty.util.Signal) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public void expect(io.netty.util.Signal r4) {
            r3 = this;
            if (r3 != r4) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected signal: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r0 = this;
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    @Override // io.netty.util.Constant
    public int id() {
            r1 = this;
            io.netty.util.Signal$SignalConstant r0 = r1.constant
            int r0 = r0.id()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable initCause(java.lang.Throwable r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.Constant
    public java.lang.String name() {
            r1 = this;
            io.netty.util.Signal$SignalConstant r0 = r1.constant
            java.lang.String r0 = r0.name()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name()
            return r0
    }
}
