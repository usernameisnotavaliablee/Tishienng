package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface f {
    public static final int A0 = 0;
    public static final int B0 = 1;
    public static final int C0 = 2;
    public static final int D0 = 3;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(master.flame.danmaku.danmaku.model.m r1);

        boolean b(master.flame.danmaku.controller.f r1);

        boolean c(master.flame.danmaku.danmaku.model.m r1);
    }

    void a(master.flame.danmaku.danmaku.model.d r1);

    void b(master.flame.danmaku.danmaku.model.d r1, boolean r2);

    void c(boolean r1);

    boolean d();

    void e();

    void f(boolean r1);

    void g(master.flame.danmaku.danmaku.parser.a r1, master.flame.danmaku.danmaku.model.android.DanmakuContext r2);

    master.flame.danmaku.danmaku.model.android.DanmakuContext getConfig();

    long getCurrentTime();

    master.flame.danmaku.danmaku.model.m getCurrentVisibleDanmakus();

    int getHeight();

    master.flame.danmaku.controller.f.a getOnDanmakuClickListener();

    android.view.View getView();

    int getWidth();

    float getXOff();

    float getYOff();

    long h();

    void hide();

    boolean isHardwareAccelerated();

    boolean isPaused();

    boolean isPrepared();

    boolean isShown();

    void j(java.lang.Long r1);

    void k();

    void m(java.lang.Long r1);

    void n(master.flame.danmaku.controller.f.a r1, float r2, float r3);

    void o(boolean r1);

    void pause();

    void release();

    void resume();

    void setCallback(master.flame.danmaku.controller.c.d r1);

    void setDrawingThreadType(int r1);

    void setOnDanmakuClickListener(master.flame.danmaku.controller.f.a r1);

    void setVisibility(int r1);

    void show();

    void start();

    void start(long r1);

    void stop();

    void toggle();
}
