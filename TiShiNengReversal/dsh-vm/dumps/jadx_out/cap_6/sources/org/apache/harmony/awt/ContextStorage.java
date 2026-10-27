package org.apache.harmony.awt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ContextStorage {
    private static final org.apache.harmony.awt.ContextStorage globalContext = null;
    private final java.lang.Object contextLock;
    private org.apache.harmony.awt.datatransfer.DTK dtk;
    private java.awt.GraphicsEnvironment graphicsEnvironment;
    private volatile boolean shutdownPending;
    private java.awt.Toolkit toolkit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ContextLock {
        final /* synthetic */ org.apache.harmony.awt.ContextStorage this$0;

        private ContextLock(org.apache.harmony.awt.ContextStorage r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ContextLock(org.apache.harmony.awt.ContextStorage r1, org.apache.harmony.awt.ContextStorage.ContextLock r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            org.apache.harmony.awt.ContextStorage r0 = new org.apache.harmony.awt.ContextStorage
            r0.<init>()
            org.apache.harmony.awt.ContextStorage.globalContext = r0
            return
    }

    public ContextStorage() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.shutdownPending = r0
            org.apache.harmony.awt.ContextStorage$ContextLock r0 = new org.apache.harmony.awt.ContextStorage$ContextLock
            r1 = 0
            r0.<init>(r2, r1)
            r2.contextLock = r0
            return
    }

    public static java.lang.Object getContextLock() {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            java.lang.Object r0 = r0.contextLock
            return r0
    }

    private static org.apache.harmony.awt.ContextStorage getCurrentContext() {
            org.apache.harmony.awt.ContextStorage r0 = org.apache.harmony.awt.ContextStorage.globalContext
            return r0
    }

    public static org.apache.harmony.awt.datatransfer.DTK getDTK() {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            org.apache.harmony.awt.datatransfer.DTK r0 = r0.dtk
            return r0
    }

    public static java.awt.Toolkit getDefaultToolkit() {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            java.awt.Toolkit r0 = r0.toolkit
            return r0
    }

    public static java.awt.GraphicsEnvironment getGraphicsEnvironment() {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            java.awt.GraphicsEnvironment r0 = r0.graphicsEnvironment
            return r0
    }

    public static void setDTK(org.apache.harmony.awt.datatransfer.DTK r1) {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            r0.dtk = r1
            return
    }

    public static void setDefaultToolkit(java.awt.Toolkit r1) {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            r0.toolkit = r1
            return
    }

    public static void setGraphicsEnvironment(java.awt.GraphicsEnvironment r1) {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            r0.graphicsEnvironment = r1
            return
    }

    public static boolean shutdownPending() {
            org.apache.harmony.awt.ContextStorage r0 = getCurrentContext()
            boolean r0 = r0.shutdownPending
            return r0
    }

    void shutdown() {
            r0 = this;
            return
    }
}
