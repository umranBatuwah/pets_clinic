/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import org.springframework.samples.petclinic.rest.dto.UserDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T17:26:04.166792+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "users", description = "Endpoints related to users.")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Create a user
     * Creates a user.
     *
     * @param userDto The user (required)
     * @return User created successfully. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or User not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "addUser",
        summary = "Create a user",
        description = "Creates a user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RestErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDto> addUser(
        @Parameter(name = "UserDto", description = "The user", required = true) @Valid @RequestBody UserDto userDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"1234abc\", \"roles\" : [ { \"name\" : \"admin\" }, { \"name\" : \"admin\" } ], \"enabled\" : true, \"username\" : \"john.doe\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
