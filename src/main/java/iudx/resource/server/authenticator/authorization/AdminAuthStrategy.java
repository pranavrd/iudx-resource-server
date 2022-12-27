package iudx.resource.server.authenticator.authorization;

import io.vertx.core.json.JsonObject;
import iudx.resource.server.authenticator.model.JwtData;
import iudx.resource.server.common.Api;

public class AdminAuthStrategy implements AuthorizationStrategy{

  private final Api api;
  private AdminAuthStrategy(Api api)
  {
    this.api = api;
    buildPermissions(api);
  }
  public static AdminAuthStrategy getInstance(Api api)
  {
    return new AdminAuthStrategy(api);
  }
  private void buildPermissions(Api api)
  {

  }
  @Override
  public boolean isAuthorized(AuthorizationRequest authRequest, JwtData jwtData) {
    return true;
  }

  @Override
  public boolean isAuthorized(AuthorizationRequest authRequest, JwtData jwtData,
      JsonObject quotaConsumed) {
    return isAuthorized(authRequest, jwtData);
  }

}
