package chess;

import com.google.gson.Gson;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Map;

public class SparkChessApplication {
    public static final Gson GSON = new Gson();
    private static final int BAD_REQUEST = 400;
    private static final int OK = 200;
    private static final int NO_CONTENT = 204;

//    public static void main(String[] args) {
//        staticFiles.location("/public");
//        ChessService chessService = new ChessService();
//
//        get("/", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            res.status(OK);
//            return render(model, "index.hbs");
//        });
//
//        post("/move", (req, res) -> {
//            MoveRequestDto moveRequestDto = GSON.fromJson(req.body(), MoveRequestDto.class);
//            res.status(OK);
//            return chessService.move(moveRequestDto);
//        }, GSON::toJson);
//
//        get("/grid/:roomName", (req, res) -> {
//            String roomName = req.params(":roomName");
//            StartRequestDto startRequestDto = new StartRequestDto(roomName);
//            GridAndPiecesResponseDto gridAndPiecesResponseDto = chessService.getGridAndPieces(startRequestDto);
//            res.status(OK);
//            return new Response(ResponseCode.OK, gridAndPiecesResponseDto);
//        }, GSON::toJson);
//
//        post("/grid/:gridId/start", (req, res) -> {
//            String gridId = req.params("gridId");
//            chessService.start(Long.parseLong(gridId));
//            res.status(OK);
//            return new Response(ResponseCode.NO_CONTENT);
//        }, GSON::toJson);
//
//        post("/grid/:gridId/finish", (req, res) -> {
//            String gridId = req.params("gridId");
//            chessService.finish(Long.parseLong(gridId));
//            res.status(OK);
//            return new Response(ResponseCode.NO_CONTENT);
//        }, GSON::toJson);
//
//        get("/room/:roomId/restart", (req, res) -> {
//            String roomId = req.params("roomId");
//            res.status(OK);
//            return new Response(ResponseCode.OK, chessService.restart(Long.parseLong(roomId)));
//        }, GSON::toJson);
//
//        exception(ChessException.class, (exception, request, response) -> {
//            Response res = new Response(exception.getCode(), exception.getMessage());
//            response.status(BAD_REQUEST);
//            response.body(GSON.toJson(res));
//        });
//    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}