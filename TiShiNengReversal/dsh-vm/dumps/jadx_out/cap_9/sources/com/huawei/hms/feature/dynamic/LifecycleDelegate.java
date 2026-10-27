package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface LifecycleDelegate {
    void onCreate(android.os.Bundle r1);

    android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3);

    void onDestroy();

    void onDestroyView();

    void onInflate(android.app.Activity r1, android.os.Bundle r2, android.os.Bundle r3);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(android.os.Bundle r1);

    void onStart();

    void onStop();
}
