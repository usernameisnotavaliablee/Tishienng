package com.google.android.datatransport.runtime.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class TimeModule_EventClockFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.time.Clock> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r0 = new com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory
                r0.<init>()
                com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory access$000() {
                com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public TimeModule_EventClockFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory create() {
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.InstanceHolder.access$000()
            return r0
    }

    public static com.google.android.datatransport.runtime.time.Clock eventClock() {
            com.google.android.datatransport.runtime.time.Clock r0 = com.google.android.datatransport.runtime.time.TimeModule.eventClock()
            java.lang.String r1 = "Cannot return null from a non-@Nullable @Provides method"
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            return r0
    }

    public com.google.android.datatransport.runtime.time.Clock get() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = eventClock()
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m62get() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.get()
            return r0
    }
}
