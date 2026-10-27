package com.kwad.components.offline.api;

import com.kwad.components.offline.api.IOfflineCompoInitConfig;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineCompo<T extends com.kwad.components.offline.api.IOfflineCompoInitConfig> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Priority {
        public static final int HIGH = -100;
        public static final int HIGHEST = -200;
        public static final int LOW = 100;
        public static final int LOWEST = 200;
        public static final int NORMAL = 0;
    }

    java.lang.Class getComponentsType();

    void init(android.content.Context r1, T r2, com.kwad.components.offline.api.InitCallBack r3);

    int priority();
}
