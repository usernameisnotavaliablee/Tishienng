package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3SilentMusicObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3SilentMusicObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3SilentMusicObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3SilentMusicObserver implements androidx.lifecycle.LifecycleObserver {

    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer a;

    public V3SilentMusicObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    private final void createMusic() {
            r2 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            r1 = 2131886174(0x7f12005e, float:1.940692E38)
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r0, r1)
            r1 = 1
            r0.setLooping(r1)
            r2.a = r0
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    private final void startPlayMusic() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    private final void stopPlayMusic() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }
}
