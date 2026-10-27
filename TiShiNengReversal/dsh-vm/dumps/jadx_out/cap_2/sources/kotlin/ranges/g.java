package kotlin.ranges;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface g<T extends java.lang.Comparable<? super T>> extends kotlin.ranges.h<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static <T extends java.lang.Comparable<? super T>> boolean a(@org.jetbrains.annotations.NotNull kotlin.ranges.g<T> r1, @org.jetbrains.annotations.NotNull T r2) {
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Comparable r0 = r1.getStart()
                boolean r0 = r1.a(r0, r2)
                if (r0 == 0) goto L1b
                java.lang.Comparable r0 = r1.getEndInclusive()
                boolean r1 = r1.a(r2, r0)
                if (r1 == 0) goto L1b
                r1 = 1
                return r1
            L1b:
                r1 = 0
                return r1
        }

        public static <T extends java.lang.Comparable<? super T>> boolean b(@org.jetbrains.annotations.NotNull kotlin.ranges.g<T> r2) {
                java.lang.Comparable r0 = r2.getStart()
                java.lang.Comparable r1 = r2.getEndInclusive()
                boolean r2 = r2.a(r0, r1)
                r2 = r2 ^ 1
                return r2
        }
    }

    boolean a(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2);

    @Override // kotlin.ranges.h, kotlin.ranges.s
    boolean contains(@org.jetbrains.annotations.NotNull T r1);

    @Override // kotlin.ranges.h, kotlin.ranges.s
    boolean isEmpty();
}
