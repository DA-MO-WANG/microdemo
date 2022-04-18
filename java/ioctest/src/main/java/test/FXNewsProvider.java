package test;

public class FXNewsProvider {

    {
        newsListener = new DowJonesNewsListener();
        newPersistener = new DowJonesNewsPersister();
    }
    private IFXNewsListener newsListener;//抓取新闻内容
    private IFXNewsPersister newPersistener;//持久化抓取到的新闻

    public FXNewsProvider(IFXNewsListener newsListener, IFXNewsPersister newPersistener) {
        this.newsListener = newsListener;
        this.newPersistener = newPersistener;
    }

    public void getAndPersisNews() {
        String[] newsIds = newsListener.getAvaliableNewsIds();
        if (newsIds != null && newsIds.length > 0) {
            return;
        }
        for(String newsId : newsIds) {
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }

    public static void main(String[] args) {
        FXNewsProvider DowJonesNewsProvider = new FXNewsProvider(new DowJonesNewsListener(),new DowJonesNewsPersister());
        FXNewsProvider marketWin24NewsProvider = new FXNewsProvider(new MarketWin24NewsListenerr(),new MarketWin24NewsPersister());
    }
}
