package com.bxkj.student.run.app.livedata;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SharedViewModel extends androidx.lifecycle.ViewModel {

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> a;

    public SharedViewModel() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> a() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.a
            return r0
    }

    public final void b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.a
            r0.setValue(r2)
            return
    }
}
