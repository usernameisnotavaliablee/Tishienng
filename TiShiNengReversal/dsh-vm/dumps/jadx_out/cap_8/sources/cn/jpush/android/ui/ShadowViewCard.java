package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ShadowViewCard extends android.widget.RelativeLayout {
    private static final int DEFAULT_VALUE_SHADOW_BOTTOM_HEIGHT = 20;
    private static final int DEFAULT_VALUE_SHADOW_COLOR = 0;
    private static final int DEFAULT_VALUE_SHADOW_LEFT_HEIGHT = 5;
    private static final int DEFAULT_VALUE_SHADOW_OFFSET_X = 0;
    private static final int DEFAULT_VALUE_SHADOW_OFFSET_Y = 8;
    private static final int DEFAULT_VALUE_SHADOW_RADIUS = 11;
    private static final int DEFAULT_VALUE_SHADOW_RIGHT_HEIGHT = 5;
    private static final int DEFAULT_VALUE_SHADOW_ROUND = 52;
    private static final int DEFAULT_VALUE_SHADOW_TOP_HEIGHT = 15;
    private int shadowBottomHeight;
    private int shadowColor;
    private int shadowLeftHeight;
    private int shadowOffsetX;
    private int shadowOffsetY;
    private int shadowRadius;
    private int shadowRightHeight;
    private int shadowRound;
    private int shadowTopHeight;

    static {
            java.lang.String r0 = "#1f253044"
            int r0 = android.graphics.Color.parseColor(r0)
            cn.jpush.android.ui.ShadowViewCard.DEFAULT_VALUE_SHADOW_COLOR = r0
            return
    }

    public ShadowViewCard(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ShadowViewCard(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ShadowViewCard(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.initView(r1, r2)
            return
    }

    public static int dp2px(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private void initView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r3 = 52
            r2.shadowRound = r3
            int r3 = cn.jpush.android.ui.ShadowViewCard.DEFAULT_VALUE_SHADOW_COLOR
            r2.shadowColor = r3
            r3 = 15
            r2.shadowTopHeight = r3
            r4 = 5
            r2.shadowRightHeight = r4
            r2.shadowLeftHeight = r4
            r0 = 20
            r2.shadowBottomHeight = r0
            r1 = 0
            r2.shadowOffsetX = r1
            r1 = 8
            r2.shadowOffsetY = r1
            r1 = 11
            r2.shadowRadius = r1
            r2.setPadding(r4, r3, r4, r0)
            r3 = 1
            r4 = 0
            r2.setLayerType(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            int r1 = r9.shadowLeftHeight
            float r1 = (float) r1
            int r2 = r9.shadowTopHeight
            float r2 = (float) r2
            int r3 = r9.getWidth()
            int r4 = r9.shadowRightHeight
            int r3 = r3 - r4
            float r3 = (float) r3
            int r4 = r9.getHeight()
            int r5 = r9.shadowBottomHeight
            int r4 = r4 - r5
            float r4 = (float) r4
            int r5 = r9.shadowRadius
            float r5 = (float) r5
            int r6 = r9.shadowOffsetX
            float r6 = (float) r6
            int r7 = r9.shadowOffsetY
            float r7 = (float) r7
            int r8 = r9.shadowColor
            r0.setShadowLayer(r5, r6, r7, r8)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r1, r2, r3, r4)
            int r1 = r9.shadowRound
            float r2 = (float) r1
            float r1 = (float) r1
            r10.drawRoundRect(r5, r2, r1, r0)
            r10.save()
            super.dispatchDraw(r10)
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }
}
