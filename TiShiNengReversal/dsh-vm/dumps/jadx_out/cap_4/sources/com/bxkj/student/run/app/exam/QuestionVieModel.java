package com.bxkj.student.run.app.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class QuestionVieModel extends androidx.lifecycle.ViewModel {

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s c;
    private boolean d;

    public QuestionVieModel() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.run.app.exam.b r0 = new com.bxkj.student.run.app.exam.b
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.b = r0
            com.bxkj.student.run.app.exam.c r0 = new com.bxkj.student.run.app.exam.c
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.c = r0
            return
    }

    public static /* synthetic */ androidx.databinding.ObservableArrayList a() {
            androidx.databinding.ObservableArrayList r0 = c()
            return r0
    }

    public static /* synthetic */ androidx.databinding.ObservableArrayMap b() {
            androidx.databinding.ObservableArrayMap r0 = d()
            return r0
    }

    private static final androidx.databinding.ObservableArrayList c() {
            androidx.databinding.ObservableArrayList r0 = new androidx.databinding.ObservableArrayList
            r0.<init>()
            return r0
    }

    private static final androidx.databinding.ObservableArrayMap d() {
            androidx.databinding.ObservableArrayMap r0 = new androidx.databinding.ObservableArrayMap
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableArrayList<java.util.Map<java.lang.String, java.lang.Object>> e() {
            r1 = this;
            kotlin.s r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            androidx.databinding.ObservableArrayList r0 = (androidx.databinding.ObservableArrayList) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer f() {
            r1 = this;
            java.lang.Integer r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableArrayMap<java.lang.String, java.lang.Object> g() {
            r1 = this;
            kotlin.s r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            androidx.databinding.ObservableArrayMap r0 = (androidx.databinding.ObservableArrayMap) r0
            return r0
    }

    public final boolean h() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public final void i(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void j(boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
