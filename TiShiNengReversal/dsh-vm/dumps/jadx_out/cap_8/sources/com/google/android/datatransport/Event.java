package com.google.android.datatransport;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class Event<T> {
    public Event() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int r2, T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            r1 = 0
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.Priority.DEFAULT
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int r2, T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.VERY_LOW
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            r1 = 0
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.Priority.VERY_LOW
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int r2, T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.HIGHEST
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T r3) {
            com.google.android.datatransport.AutoValue_Event r0 = new com.google.android.datatransport.AutoValue_Event
            r1 = 0
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.Priority.HIGHEST
            r0.<init>(r1, r3, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public abstract java.lang.Integer getCode();

    public abstract T getPayload();

    public abstract com.google.android.datatransport.Priority getPriority();
}
