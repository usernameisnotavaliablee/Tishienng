package androidx.media.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NotificationCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DecoratedMediaCustomViewStyle extends androidx.media.app.NotificationCompat.MediaStyle {
        public DecoratedMediaCustomViewStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private void setBackgroundColor(android.widget.RemoteViews r4) {
                r3 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                int r0 = r0.getColor()
                if (r0 == 0) goto Lf
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                int r0 = r0.getColor()
                goto L1d
            Lf:
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.media.R.color.notification_material_background_media_default_color
                int r0 = r0.getColor(r1)
            L1d:
                int r1 = androidx.media.R.id.status_bar_latest_event_content
                java.lang.String r2 = "setBackgroundColor"
                r4.setInt(r1, r2, r0)
                return
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L16
                android.app.Notification$Builder r3 = r3.getBuilder()
                android.app.Notification$DecoratedMediaCustomViewStyle r0 = androidx.media.app.a.a()
                android.app.Notification$MediaStyle r0 = r2.fillInMediaStyle(r0)
                r3.setStyle(r0)
                return
            L16:
                super.apply(r3)
                return
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getBigContentViewLayoutResource(int r2) {
                r1 = this;
                r0 = 3
                if (r2 > r0) goto L6
                int r2 = androidx.media.R.layout.notification_template_big_media_narrow_custom
                return r2
            L6:
                int r2 = androidx.media.R.layout.notification_template_big_media_custom
                return r2
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getContentViewLayoutResource() {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                android.widget.RemoteViews r0 = r0.getContentView()
                if (r0 == 0) goto Lb
                int r0 = androidx.media.R.layout.notification_template_media_custom
                return r0
            Lb:
                int r0 = super.getContentViewLayoutResource()
                return r0
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r3 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                r1 = 0
                if (r3 < r0) goto L8
                return r1
            L8:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getBigContentView()
                if (r3 == 0) goto L17
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getBigContentView()
                goto L1d
            L17:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
            L1d:
                if (r3 != 0) goto L20
                return r1
            L20:
                android.widget.RemoteViews r0 = r2.generateBigContentView()
                r2.buildIntoRemoteViews(r0, r3)
                r2.setBackgroundColor(r0)
                return r0
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r3 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                r1 = 0
                if (r3 < r0) goto L8
                return r1
            L8:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
                if (r3 == 0) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                if (r3 != 0) goto L1f
                androidx.core.app.NotificationCompat$Builder r0 = r2.mBuilder
                android.widget.RemoteViews r0 = r0.getBigContentView()
                if (r0 == 0) goto L1e
                goto L1f
            L1e:
                return r1
            L1f:
                android.widget.RemoteViews r0 = r2.generateContentView()
                if (r3 == 0) goto L2e
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
                r2.buildIntoRemoteViews(r0, r3)
            L2e:
                r2.setBackgroundColor(r0)
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r3 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                r1 = 0
                if (r3 < r0) goto L8
                return r1
            L8:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getHeadsUpContentView()
                if (r3 == 0) goto L17
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getHeadsUpContentView()
                goto L1d
            L17:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
            L1d:
                if (r3 != 0) goto L20
                return r1
            L20:
                android.widget.RemoteViews r0 = r2.generateBigContentView()
                r2.buildIntoRemoteViews(r0, r3)
                r2.setBackgroundColor(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        int[] mActionsToShowInCompact;
        android.app.PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        android.support.v4.media.session.MediaSessionCompat.Token mToken;

        public MediaStyle() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mActionsToShowInCompact = r0
                return
        }

        public MediaStyle(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mActionsToShowInCompact = r0
                r1.setBuilder(r2)
                return
        }

        private android.widget.RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action r5) {
                r4 = this;
                android.app.PendingIntent r0 = r5.getActionIntent()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                android.widget.RemoteViews r1 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r2 = r4.mBuilder
                android.content.Context r2 = r2.mContext
                java.lang.String r2 = r2.getPackageName()
                int r3 = androidx.media.R.layout.notification_media_action
                r1.<init>(r2, r3)
                int r2 = androidx.media.R.id.action0
                int r3 = r5.getIcon()
                r1.setImageViewResource(r2, r3)
                if (r0 != 0) goto L2a
                android.app.PendingIntent r0 = r5.getActionIntent()
                r1.setOnClickPendingIntent(r2, r0)
            L2a:
                java.lang.CharSequence r5 = r5.getTitle()
                r1.setContentDescription(r2, r5)
                return r1
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(android.app.Notification r1) {
                android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r1)
                if (r1 == 0) goto L13
                java.lang.String r0 = "android.mediaSession"
                android.os.Parcelable r1 = r1.getParcelable(r0)
                if (r1 == 0) goto L13
                android.support.v4.media.session.MediaSessionCompat$Token r1 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r1)
                return r1
            L13:
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                android.app.Notification$Builder r2 = r2.getBuilder()
                android.app.Notification$MediaStyle r0 = new android.app.Notification$MediaStyle
                r0.<init>()
                android.app.Notification$MediaStyle r0 = r1.fillInMediaStyle(r0)
                r2.setStyle(r0)
                return
        }

        @androidx.annotation.RequiresApi(21)
        android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle r2) {
                r1 = this;
                int[] r0 = r1.mActionsToShowInCompact
                if (r0 == 0) goto L7
                r2.setShowActionsInCompactView(r0)
            L7:
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mToken
                if (r0 == 0) goto L14
                java.lang.Object r0 = r0.getToken()
                android.media.session.MediaSession$Token r0 = (android.media.session.MediaSession.Token) r0
                r2.setMediaSession(r0)
            L14:
                return r2
        }

        android.widget.RemoteViews generateBigContentView() {
                r6 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r6.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r0.mActions
                int r0 = r0.size()
                r1 = 5
                int r0 = java.lang.Math.min(r0, r1)
                int r1 = r6.getBigContentViewLayoutResource(r0)
                r2 = 0
                android.widget.RemoteViews r1 = r6.applyStandardTemplate(r2, r1, r2)
                int r3 = androidx.media.R.id.media_actions
                r1.removeAllViews(r3)
                if (r0 <= 0) goto L36
                r3 = 0
            L1e:
                if (r3 >= r0) goto L36
                androidx.core.app.NotificationCompat$Builder r4 = r6.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r4 = r4.mActions
                java.lang.Object r4 = r4.get(r3)
                androidx.core.app.NotificationCompat$Action r4 = (androidx.core.app.NotificationCompat.Action) r4
                android.widget.RemoteViews r4 = r6.generateMediaActionButton(r4)
                int r5 = androidx.media.R.id.media_actions
                r1.addView(r5, r4)
                int r3 = r3 + 1
                goto L1e
            L36:
                boolean r0 = r6.mShowCancelButton
                if (r0 == 0) goto L58
                int r0 = androidx.media.R.id.cancel_action
                r1.setViewVisibility(r0, r2)
                androidx.core.app.NotificationCompat$Builder r2 = r6.mBuilder
                android.content.Context r2 = r2.mContext
                android.content.res.Resources r2 = r2.getResources()
                int r3 = androidx.media.R.integer.cancel_button_image_alpha
                int r2 = r2.getInteger(r3)
                java.lang.String r3 = "setAlpha"
                r1.setInt(r0, r3, r2)
                android.app.PendingIntent r2 = r6.mCancelButtonIntent
                r1.setOnClickPendingIntent(r0, r2)
                return r1
            L58:
                int r0 = androidx.media.R.id.cancel_action
                r2 = 8
                r1.setViewVisibility(r0, r2)
                return r1
        }

        android.widget.RemoteViews generateContentView() {
                r8 = this;
                int r0 = r8.getContentViewLayoutResource()
                r1 = 0
                r2 = 1
                android.widget.RemoteViews r0 = r8.applyStandardTemplate(r1, r0, r2)
                androidx.core.app.NotificationCompat$Builder r3 = r8.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r3.mActions
                int r3 = r3.size()
                int[] r4 = r8.mActionsToShowInCompact
                if (r4 != 0) goto L18
                r4 = 0
                goto L1e
            L18:
                int r4 = r4.length
                r5 = 3
                int r4 = java.lang.Math.min(r4, r5)
            L1e:
                int r5 = androidx.media.R.id.media_actions
                r0.removeAllViews(r5)
                if (r4 <= 0) goto L60
                r5 = 0
            L26:
                if (r5 >= r4) goto L60
                if (r5 >= r3) goto L44
                androidx.core.app.NotificationCompat$Builder r6 = r8.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r6 = r6.mActions
                int[] r7 = r8.mActionsToShowInCompact
                r7 = r7[r5]
                java.lang.Object r6 = r6.get(r7)
                androidx.core.app.NotificationCompat$Action r6 = (androidx.core.app.NotificationCompat.Action) r6
                android.widget.RemoteViews r6 = r8.generateMediaActionButton(r6)
                int r7 = androidx.media.R.id.media_actions
                r0.addView(r7, r6)
                int r5 = r5 + 1
                goto L26
            L44:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                int r3 = r3 - r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r1] = r4
                r5[r2] = r3
                java.lang.String r1 = "setShowActionsInCompactView: action %d out of bounds (max %d)"
                java.lang.String r1 = java.lang.String.format(r1, r5)
                r0.<init>(r1)
                throw r0
            L60:
                boolean r2 = r8.mShowCancelButton
                r3 = 8
                if (r2 == 0) goto L89
                int r2 = androidx.media.R.id.end_padder
                r0.setViewVisibility(r2, r3)
                int r2 = androidx.media.R.id.cancel_action
                r0.setViewVisibility(r2, r1)
                android.app.PendingIntent r1 = r8.mCancelButtonIntent
                r0.setOnClickPendingIntent(r2, r1)
                androidx.core.app.NotificationCompat$Builder r1 = r8.mBuilder
                android.content.Context r1 = r1.mContext
                android.content.res.Resources r1 = r1.getResources()
                int r3 = androidx.media.R.integer.cancel_button_image_alpha
                int r1 = r1.getInteger(r3)
                java.lang.String r3 = "setAlpha"
                r0.setInt(r2, r3, r1)
                return r0
            L89:
                int r2 = androidx.media.R.id.end_padder
                r0.setViewVisibility(r2, r1)
                int r1 = androidx.media.R.id.cancel_action
                r0.setViewVisibility(r1, r3)
                return r0
        }

        int getBigContentViewLayoutResource(int r2) {
                r1 = this;
                r0 = 3
                if (r2 > r0) goto L6
                int r2 = androidx.media.R.layout.notification_template_big_media_narrow
                return r2
            L6:
                int r2 = androidx.media.R.layout.notification_template_big_media
                return r2
        }

        int getContentViewLayoutResource() {
                r1 = this;
                int r0 = androidx.media.R.layout.notification_template_media
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public androidx.media.app.NotificationCompat.MediaStyle setCancelButtonIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mCancelButtonIntent = r1
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token r1) {
                r0 = this;
                r0.mToken = r1
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowActionsInCompactView(int... r1) {
                r0 = this;
                r0.mActionsToShowInCompact = r1
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowCancelButton(boolean r1) {
                r0 = this;
                return r0
        }
    }

    private NotificationCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
