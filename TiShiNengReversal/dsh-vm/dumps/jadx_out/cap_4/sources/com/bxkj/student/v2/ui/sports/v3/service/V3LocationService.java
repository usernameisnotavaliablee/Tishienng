package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3LocationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3LocationService.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3LocationService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3LocationService extends androidx.lifecycle.LifecycleService {

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver a;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.V3SilentMusicObserver b;

    public V3LocationService() {
            r2 = this;
            r2.<init>()
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0 = r2.a
            if (r0 != 0) goto L23
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver
            r0.<init>(r2)
            r2.a = r0
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.addObserver(r0)
            com.bxkj.student.v2.ui.sports.v3.service.V3SilentMusicObserver r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3SilentMusicObserver
            r0.<init>()
            r2.b = r0
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.addObserver(r0)
        L23:
            return
    }

    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r1, int r2, int r3) {
            r0 = this;
            super.onStartCommand(r1, r2, r3)
            r1 = 1
            return r1
    }

    public void onTaskRemoved(@org.jetbrains.annotations.Nullable android.content.Intent r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L8
            java.lang.String r1 = r5.toString()
            goto L9
        L8:
            r1 = r0
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "StepService->onTaskRemoved "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r1, r3)
            if (r5 == 0) goto L2c
            android.content.ComponentName r5 = r5.getComponent()
            if (r5 == 0) goto L2c
            java.lang.String r0 = r5.getClassName()
        L2c:
            java.lang.String r5 = "com.acse.ottn.activity.TransparentGreenActivity"
            boolean r5 = kotlin.jvm.internal.g0.g(r0, r5)
            if (r5 == 0) goto L3c
            java.lang.String r5 = "来自省钱助手的错误杀进程"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r5, r0)
            return
        L3c:
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r5 = r4.a
            if (r5 == 0) goto L43
            r5.onDestroy()
        L43:
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r5 = r4.a
            if (r5 == 0) goto L4e
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r0.removeObserver(r5)
        L4e:
            com.bxkj.student.v2.ui.sports.v3.service.V3SilentMusicObserver r5 = r4.b
            if (r5 == 0) goto L59
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r0.removeObserver(r5)
        L59:
            return
    }
}
