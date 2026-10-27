package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FilterFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FilterNotCreatedException extends java.lang.Exception {
        public FilterNotCreatedException(java.lang.Exception r2) {
                r1 = this;
                java.lang.String r0 = r2.getMessage()
                r1.<init>(r0, r2)
                return
        }
    }

    org.junit.runner.manipulation.a a(org.junit.runner.d r1) throws org.junit.runner.FilterFactory.FilterNotCreatedException;
}
