package com.bxkj.student.v2.ui.sports.v3.service.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3StepService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3StepService.kt\ncom/bxkj/student/v2/ui/sports/v3/service/step/V3StepService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3StepService extends androidx.lifecycle.LifecycleService {

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver a;

    public V3StepService() {
            r2 = this;
            r2.<init>()
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = r2.a
            if (r0 != 0) goto L15
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r0 = new com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver
            r0.<init>(r2)
            r2.a = r0
            androidx.lifecycle.Lifecycle r1 = r2.getLifecycle()
            r1.addObserver(r0)
        L15:
            return
    }

    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r1, int r2, int r3) {
            r0 = this;
            super.onStartCommand(r1, r2, r3)
            r1 = 1
            return r1
    }

    public void onTaskRemoved(@org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "StepService->onTaskRemoved"
            com.orhanobut.logger.j.d(r2, r1)
            if (r4 == 0) goto L15
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L15
            java.lang.String r4 = r4.getClassName()
            goto L16
        L15:
            r4 = 0
        L16:
            java.lang.String r1 = "com.acse.ottn.activity.TransparentGreenActivity"
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r1)
            if (r4 == 0) goto L26
            java.lang.String r4 = "来自省钱助手的错误杀进程"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r4, r0)
            return
        L26:
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r4 = r3.a
            if (r4 == 0) goto L2d
            r4.onDestroy()
        L2d:
            com.bxkj.student.v2.ui.sports.v3.service.step.V3StepObserver r4 = r3.a
            if (r4 == 0) goto L38
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            r0.removeObserver(r4)
        L38:
            return
    }
}
