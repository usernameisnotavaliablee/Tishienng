package io.netty.util.internal.shaded.org.jctools.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface PortableJvmInfo {
    public static final int CACHE_LINE_SIZE = 0;
    public static final int CPUs = 0;
    public static final int RECOMENDED_OFFER_BATCH = 0;
    public static final int RECOMENDED_POLL_BATCH = 0;

    static {
            java.lang.String r0 = "jctools.cacheLineSize"
            r1 = 64
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.CACHE_LINE_SIZE = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.CPUs = r0
            int r1 = r0 * 4
            io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH = r1
            int r0 = r0 * 4
            io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo.RECOMENDED_POLL_BATCH = r0
            return
    }
}
