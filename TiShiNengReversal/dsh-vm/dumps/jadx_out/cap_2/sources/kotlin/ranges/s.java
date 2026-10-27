package kotlin.ranges;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface s<T extends java.lang.Comparable<? super T>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static <T extends java.lang.Comparable<? super T>> boolean a(@org.jetbrains.annotations.NotNull kotlin.ranges.s<T> r1, @org.jetbrains.annotations.NotNull T r2) {
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Comparable r0 = r1.getStart()
                int r0 = r2.compareTo(r0)
                if (r0 < 0) goto L1b
                java.lang.Comparable r1 = r1.d()
                int r1 = r2.compareTo(r1)
                if (r1 >= 0) goto L1b
                r1 = 1
                return r1
            L1b:
                r1 = 0
                return r1
        }

        public static <T extends java.lang.Comparable<? super T>> boolean b(@org.jetbrains.annotations.NotNull kotlin.ranges.s<T> r1) {
                java.lang.Comparable r0 = r1.getStart()
                java.lang.Comparable r1 = r1.d()
                int r1 = r0.compareTo(r1)
                if (r1 < 0) goto L10
                r1 = 1
                return r1
            L10:
                r1 = 0
                return r1
        }
    }

    boolean contains(@org.jetbrains.annotations.NotNull T r1);

    @org.jetbrains.annotations.NotNull
    T d();

    @org.jetbrains.annotations.NotNull
    T getStart();

    boolean isEmpty();
}
