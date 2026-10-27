package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.resolve.constants.r<java.lang.Character> {
    public e(char r1) {
            r0 = this;
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.<init>(r1)
            return
    }

    private final java.lang.String b(char r2) {
            r1 = this;
            switch(r2) {
                case 8: goto L1d;
                case 9: goto L1a;
                case 10: goto L17;
                case 11: goto L3;
                case 12: goto L14;
                case 13: goto L11;
                default: goto L3;
            }
        L3:
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto Le
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Le:
            java.lang.String r2 = "?"
            return r2
        L11:
            java.lang.String r2 = "\\r"
            return r2
        L14:
            java.lang.String r2 = "\\f"
            return r2
        L17:
            java.lang.String r2 = "\\n"
            return r2
        L1a:
            java.lang.String r2 = "\\t"
            return r2
        L1d:
            java.lang.String r2 = "\\b"
            return r2
    }

    private final boolean c(char r2) {
            r1 = this;
            int r2 = java.lang.Character.getType(r2)
            byte r2 = (byte) r2
            if (r2 == 0) goto L21
            r0 = 13
            if (r2 == r0) goto L21
            r0 = 14
            if (r2 == r0) goto L21
            r0 = 15
            if (r2 == r0) goto L21
            r0 = 16
            if (r2 == r0) goto L21
            r0 = 18
            if (r2 == r0) goto L21
            r0 = 19
            if (r2 == r0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.v()
            java.lang.String r0 = "getCharType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.getType(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            java.lang.Object r0 = r5.a()
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r5.a()
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            java.lang.String r1 = r5.b(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r1 = "\\u%04X ('%s')"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
