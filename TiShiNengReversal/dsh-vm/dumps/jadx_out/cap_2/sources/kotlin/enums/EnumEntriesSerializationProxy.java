package kotlin.enums;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class EnumEntriesSerializationProxy<E extends java.lang.Enum<E>> implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.enums.EnumEntriesSerializationProxy.a Companion = null;
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<E> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.enums.EnumEntriesSerializationProxy$a r0 = new kotlin.enums.EnumEntriesSerializationProxy$a
            r1 = 0
            r0.<init>(r1)
            kotlin.enums.EnumEntriesSerializationProxy.Companion = r0
            return
    }

    public EnumEntriesSerializationProxy(@org.jetbrains.annotations.NotNull E[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            kotlin.jvm.internal.g0.m(r2)
            r1.c = r2
            return
    }

    private final java.lang.Object readResolve() {
            r2 = this;
            java.lang.Class<E extends java.lang.Enum<E>> r0 = r2.c
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.String r1 = "getEnumConstants(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            return r0
    }
}
