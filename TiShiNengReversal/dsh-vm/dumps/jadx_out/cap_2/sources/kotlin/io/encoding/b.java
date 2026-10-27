package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,843:1\n13880#2,3:844\n13880#2,3:847\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n785#1:844,3\n801#1:847,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    private static final byte[] a = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] b = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] c = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] d = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            kotlin.io.encoding.b.a = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r2 = new int[r1]
            r6 = 6
            r7 = 0
            r3 = -1
            r4 = 0
            r5 = 0
            kotlin.collections.n.T1(r2, r3, r4, r5, r6, r7)
            r3 = 61
            r4 = -2
            r2[r3] = r4
            int r5 = r0.length
            r6 = 0
            r7 = 0
            r8 = 0
        L1e:
            if (r7 >= r5) goto L2a
            r9 = r0[r7]
            int r10 = r8 + 1
            r2[r9] = r8
            int r7 = r7 + 1
            r8 = r10
            goto L1e
        L2a:
            kotlin.io.encoding.b.b = r2
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0076: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            kotlin.io.encoding.b.c = r0
            int[] r7 = new int[r1]
            r11 = 6
            r12 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            kotlin.collections.n.T1(r7, r8, r9, r10, r11, r12)
            r7[r3] = r4
            int r1 = r0.length
            r2 = 0
        L43:
            if (r6 >= r1) goto L4f
            r3 = r0[r6]
            int r4 = r2 + 1
            r7[r3] = r2
            int r6 = r6 + 1
            r2 = r4
            goto L43
        L4f:
            kotlin.io.encoding.b.d = r7
            return
    }

    public static final /* synthetic */ int[] a() {
            int[] r0 = kotlin.io.encoding.b.b
            return r0
    }

    public static final /* synthetic */ byte[] b() {
            byte[] r0 = kotlin.io.encoding.b.a
            return r0
    }

    public static final /* synthetic */ int[] c() {
            int[] r0 = kotlin.io.encoding.b.d
            return r0
    }

    public static final /* synthetic */ byte[] d() {
            byte[] r0 = kotlin.io.encoding.b.c
            return r0
    }

    @kotlin.SinceKotlin(version = "1.8")
    public static final boolean e(int r2) {
            if (r2 < 0) goto Le
            int[] r0 = kotlin.io.encoding.b.b
            int r1 = r0.length
            if (r2 >= r1) goto Le
            r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }
}
