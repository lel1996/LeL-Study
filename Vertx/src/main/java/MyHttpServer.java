import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

public class MyHttpServer extends AbstractVerticle {

    public static void main(String[] args) {
        // ��������
        MyHttpServer verticle = new MyHttpServer();
        Vertx vertx = Vertx.vertx();

        // ������񣬻�ִ��MyHttpServer��start����
        vertx.deployVerticle(verticle);
    }

    @Override
    public void start() throws Exception {
        // ���������ͨ��this.vertx��ȡ����ǰ��Vertx
        Vertx vertx = this.vertx;

        // ����һ��HttpServer
        HttpServer server = vertx.createHttpServer();

        server.requestHandler(request -> {
            // ��ȡ��response����
            HttpServerResponse response = request.response();

            // ������Ӧͷ
            response.putHeader("Content-type", "text/html;charset=utf-8");

            // ��Ӧ����
            response.end("SUCCESS");

        });

        // ָ������80�˿�
        server.listen(80);
    }
}