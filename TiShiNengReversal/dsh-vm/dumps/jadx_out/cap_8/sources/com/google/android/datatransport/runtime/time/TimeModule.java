package com.google.android.datatransport.runtime.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class TimeModule {
    public TimeModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @com.google.android.datatransport.runtime.time.WallTime
    static com.google.android.datatransport.runtime.time.Clock eventClock() {
            com.google.android.datatransport.runtime.time.WallTimeClock r0 = new com.google.android.datatransport.runtime.time.WallTimeClock
            r0.<init>()
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @com.google.android.datatransport.runtime.time.Monotonic
    static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
            com.google.android.datatransport.runtime.time.UptimeClock r0 = new com.google.android.datatransport.runtime.time.UptimeClock
            r0.<init>()
            return r0
    }
}
